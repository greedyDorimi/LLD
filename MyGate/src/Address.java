public class Address {
    private Integer buildingNo;
    private Integer floorNo; // assuming floor as house

    public Address(Integer buildingNo, Integer floorNo) {
        this.buildingNo = buildingNo;
        this.floorNo = floorNo;
    }

    public Integer getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(Integer buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }
}
