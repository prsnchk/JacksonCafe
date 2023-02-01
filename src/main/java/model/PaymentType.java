package model;

public class PaymentType {
    private int id;
    private String name;

    public PaymentType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PaymentType(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
