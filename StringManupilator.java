public class StringManupilator {
    public String trimAndConcat(String string1, String string2) {
        return string1.trim() + string2.trim();
    }

    public Integer getIndexOrNull(String string1, char char1) {
        int  idx = string1.indexOf(char1);
        return idx == -1 ? null: idx;
    }

    public Integer getIndexOrNull(String string1, String string2) {
        int idx = string1.indexOf(string2);
        return idx == -1 ? null: idx;
    }

    public String concatSubString(String string1,int integer1, int integer2, String string2) {
        String substring = string1.substring(integer1, integer2);
        return substring + string2;
    }

}
