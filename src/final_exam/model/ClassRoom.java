package final_exam.model;

public class ClassRoom {
    private int classRoomId;
    private String name;
    private int teacherId;

    public ClassRoom(){}

    public ClassRoom(int classRoomId, String name, int teacherId) {
        this.classRoomId = classRoomId;
        this.name = name;
        this.teacherId = teacherId;
    }

    public int getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomId=" + classRoomId +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
