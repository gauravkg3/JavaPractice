package InterviewQuestion;

public class DbConnection {
    private static volatile DbConnection conObject;

    private DbConnection() {

    }

    public static DbConnection getInstance() {
        if (conObject == null) {
            synchronized (DbConnection.class) {
                if (conObject == null) {
                    conObject = new DbConnection();
                }
            }
        }
        return conObject;

    }
}

