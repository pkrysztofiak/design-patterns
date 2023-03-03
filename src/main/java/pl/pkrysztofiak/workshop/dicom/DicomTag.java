package pl.pkrysztofiak.workshop.dicom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DicomTag {

    protected final String value;

    public DicomTag(String value) {
        this.value = value;
    }

    public boolean validate() {
        String pattern = "^\\s*[+-]?\\d+(\\.\\d+)?([Ee][+-]?\\d+)?\\s*$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(value);
        return matcher.matches();
    }
}