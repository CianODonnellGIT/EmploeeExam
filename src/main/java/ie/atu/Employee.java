package ie.atu;

public class Employee {

    private String name;
    private int id;


    public Employee (String name, int id){
       setName(name);
       setId(id);

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.length() > 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if (id > 8){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("This is not a valid id");
        }
    }

}
