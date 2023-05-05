import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        GeoTargetingService geoTargetingService = GeoTargetingService.getInstance();

        String phonepeNamespace = "phonepe";

        Set<String> states = new HashSet<>(Arrays.asList("UP"));
        Set<String> districts = new HashSet<>(Arrays.asList("Farrukhabad"));
        Set<String> cities = new HashSet<>(Arrays.asList("Kanpur", "Lucknow"));
        Set<String> pincodes = new HashSet<>(Arrays.asList("209625", "260037"));
        TargetingRequest targetingRequest1 = new TargetingRequest(states, districts, cities, pincodes);
        String tragetingID1 = geoTargetingService.createTargeting(phonepeNamespace, targetingRequest1);

        states = new HashSet<>(Arrays.asList("UP"));
        districts = new HashSet<>();
        cities = new HashSet<>(Arrays.asList());
        pincodes = new HashSet<>(Arrays.asList());
        TargetingRequest targetingRequest12 = new TargetingRequest(states, districts, cities, pincodes);
        String tragetingID12 = geoTargetingService.createTargeting(phonepeNamespace, targetingRequest12);

        Location existlocation1 = new Location("UP", "Farrukhabad", "Kanpur", "209625");
        Location notExistlocation1 = new Location("U", "Farrukhabad", "Kanpur", "209625");
        boolean exist1 = geoTargetingService.checkTargeting(phonepeNamespace, tragetingID1, existlocation1);
        boolean notExist1 = geoTargetingService.checkTargeting(phonepeNamespace, tragetingID1, notExistlocation1);
        System.out.println(exist1 + " " + notExist1);

        String amazonNamespace = "amazon";

        states = new HashSet<>(Arrays.asList("MP"));
        districts = new HashSet<>(Arrays.asList("Haridwar"));
        cities = new HashSet<>(Arrays.asList("Vanaras", "Allahabad"));
        pincodes = new HashSet<>(Arrays.asList("201625", "360037"));
        TargetingRequest targetingRequest2 = new TargetingRequest(states, districts, cities, pincodes);
        String tragetingID2 = geoTargetingService.createTargeting(amazonNamespace, targetingRequest2);

        List<String> targetings = geoTargetingService.checkAllTargeting(phonepeNamespace, existlocation1);
        System.out.println("user1 satisfied targettings: " + targetings);

        List<String> allAmazonTargetings = geoTargetingService.getTargeting(amazonNamespace);
        List<String> allPhonepeTargetings = geoTargetingService.getTargeting(phonepeNamespace);
        System.out.println("allAmazonTargetings " + allAmazonTargetings);
        System.out.println("allPhonepeTargetings: " + allPhonepeTargetings);

        geoTargetingService.updateTargeting(phonepeNamespace, tragetingID1, targetingRequest2);

        geoTargetingService.deleteTargeting(phonepeNamespace, tragetingID1);

        allPhonepeTargetings = geoTargetingService.getTargeting(phonepeNamespace);
        System.out.println("allPhonepeTargetings: " + allPhonepeTargetings);

    }
}