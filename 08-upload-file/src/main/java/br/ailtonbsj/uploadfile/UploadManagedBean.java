package br.ailtonbsj.uploadfile;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@SessionScoped
public class UploadManagedBean implements Serializable {
    private String photo = "";
    private Part part;
    
    public String processUpload() {
        UploadHelper uploadHelper = new UploadHelper();
        this.photo = uploadHelper.processUpload(this.part);
        return "result";
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
