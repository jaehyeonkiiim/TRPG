import java.util.HashMap;

public class Status {

    Character character;
    HashMap<String, String> characterMap = Character.characterMap;
    HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
    public Status(){
        character = new Character();

    }
    public enum status{
        STR, DEX, INT, CON, BLS;
    }

    public void setStatus(){
        setRaceStatus();
        setJobsStatus();
    }

    // ���� ���� ����
    public void setRaceStatus(){
        if (characterMap.get("race").equals("OAK")){
            statusMap.put(status.STR.name(), 5);
            System.out.println(statusMap.get(status.STR.name()));
        }
    }

    // ���� ���� ����
    public void setJobsStatus(){
        if (characterMap.get("jobs").equals("KNIGHT")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            System.out.println(statusMap.get(status.STR.name()));
        }
    }

    }


