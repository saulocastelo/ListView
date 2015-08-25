package br.com.rapidweb.listview;

/**
 * Created by saulocsampaio on 25/08/15.
 */
public class Contact {
    private String name;
    private String phone;
    private String image;

    public Contact(String name, String phone, String image) {
        this.name = name;
        this.name = phone;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
