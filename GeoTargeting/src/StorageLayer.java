import java.util.List;

public interface StorageLayer {
    public void addTargetings(String namespace, TargetingRequest targetingRequest)
    public void updateTargeting(String namespace, String targetingId, TargetingRequest targetingRequest);
    public void deleteTargeting(String namespace, String targetingId);

    public Targeting retrieveTargeting(String namespace, String targetingId);
    public List<Targeting> retrieve(String namespace);
}
