package enumConstant;


public enum ScoreConstant {
    LOVE(0,0), FIFTEEN(1,15), THIRTY(2,30), FORTY(3,40);

    public int id;
    public int point;

    ScoreConstant(final int idValue, final int pointValue) {
        this.id = idValue;
        this.point = pointValue;
    }



    public static int valueOf(final int id) {
        for (ScoreConstant status : values()) {
            if (status.id == id) {
                return status.point;
            }
        }
        return FORTY.point;
    }
}
