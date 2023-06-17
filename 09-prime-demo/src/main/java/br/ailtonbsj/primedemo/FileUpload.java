package br.ailtonbsj.primedemo;

import java.io.InputStream;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

@Named
public class FileUpload {
    public void handleFileUpload(FileUploadEvent event) {
        try {
            byte[] fileContent = new byte[(int) event.getFile().getSize()];
            InputStream in = event.getFile().getInputstream();
            in.read(fileContent);
            Long nameRadom = Calendar.getInstance().getTimeInMillis();
            String currentFileName = event.getFile().getFileName();
            String extension = currentFileName.substring(currentFileName.lastIndexOf("."), currentFileName.length());
            String newfilename = nameRadom + extension;
            File fileToCreate = new File("/tmp/", newfilename);
            try (FileOutputStream fileOutStream = new FileOutputStream(fileToCreate)) {
                fileOutStream.write(fileContent);
                fileOutStream.flush();
            }
            
            FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
            FacesContext.getCurrentInstance().addMessage(null, message);
        } catch (IOException e) {
            FacesMessage message = new FacesMessage("Fail", event.getFile().getFileName() + " is uploaded.");  
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
          
    }
}
