package phones;

import java.util.HashMap;

public class PhoneInventory {
    private HashMap<String,Phone> phoneInventory;

    public PhoneInventory() {
        phoneInventory = new HashMap<>();
    }

    public void addPhone(String dni, Phone phone){
        if (phoneInventory.containsKey(dni)){
            System.out.println("Student with that ID already exists");
        } else {
            phoneInventory.put(dni,phone);
            System.out.println("Mobile added successfully.");
        }
    }

    public void deletePhone(String id){
        if(phoneInventory.containsKey(id)){
            phoneInventory.remove(id);
            System.out.println("Student remove successfully");
        } else {
            System.out.println("Student with that id does not exist");
        }
    }

    public Phone searchPhoneById(String id){
        return phoneInventory.getOrDefault(id, null);
    }

    public String searchIdByPhoneNumber(int phoneNumber){
        for(String id : phoneInventory.keySet()){
            if(phoneInventory.get(id).getNumber() == phoneNumber){
                return id;
            }
        }
        return null;
    }


}
