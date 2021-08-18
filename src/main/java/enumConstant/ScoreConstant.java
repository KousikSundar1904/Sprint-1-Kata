package enumConstant;

public enum ScoreConstant {
    LOVE(0,0), FIFTEEN(1,15), THIRTY(2,30), FORTY(3,40);

    private int id;
    private int point;

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
        throw new IllegalArgumentException("No matching constant for [" + id + "]");
    }
}
