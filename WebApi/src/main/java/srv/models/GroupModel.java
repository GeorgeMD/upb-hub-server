package srv.models;

import srv.entities.GroupEntity;

/**
 * @author GeorgeMD
 */
public class GroupModel {
    private Integer groupId;
    private String number;
    private int year;
//    private String series;

    public GroupModel() { }

    public GroupModel(final GroupEntity entity) {
        if (entity != null) {
            this.groupId = entity.getGroupId();
            this.number = entity.getNumber();
            this.year = entity.getYear();
//            this.series = entity.getSeries();
        }
    }

    public Integer getGroupId() {
        return groupId;
    }

    public int getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

//    public String getSeries() {
//        return series;
//    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void setSeries(String series) {
//        this.series = series;
//    }

    public GroupEntity toEntity() {
        GroupEntity groupEntity = new GroupEntity();
        groupEntity.setGroupId(groupId);
        groupEntity.setNumber(number);
        groupEntity.setYear(year);
//        groupEntity.setSeries(series);

        return groupEntity;
    }
}
