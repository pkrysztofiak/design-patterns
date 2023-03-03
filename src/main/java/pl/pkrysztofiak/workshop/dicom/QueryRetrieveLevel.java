package pl.pkrysztofiak.workshop.dicom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryRetrieveLevel extends DicomTag {
    public QueryRetrieveLevel(String value) {
        super(value);
    }

    @Override
    public boolean validate() {
        String pattern = "^[A-Z0-9_ ]+$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(value);
        return matcher.matches();
    }
}
