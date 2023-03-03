package pl.pkrysztofiak.workshop.dicom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientAge extends DicomTag {
    public PatientAge(String value) {
        super(value);
    }

    @Override
    public boolean validate() {
        String pattern = "$[0-9DWMY]+^";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(value);
        return super.validate();
    }
}
