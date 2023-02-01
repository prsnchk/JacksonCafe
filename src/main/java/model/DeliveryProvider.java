package model;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;

public class DeliveryProvider {

    private int id;
    private String providerName;

    public DeliveryProvider(int id, String providerName) {
        this.id = id;
        this.providerName = providerName;
    }

    public DeliveryProvider(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }


}
