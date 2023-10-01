package StructuralPatterns.Proxy;

public class Main {
    //���������  � ��� ������ � �� (�� ����� ���������� �� ���� jdbc
    interface Database{
        String connect(String ConnectionString);
        String querry(String SQL);
    }
    //����� ��� ������ � ��
    static class DatabaseWorker implements Database{

        @Override
        public String connect(String ConnectionString) {
            System.out.println("Connected to DB");
            return "Connected to DB "+ ConnectionString;
        }

        @Override
        public String querry(String SQL) {
            return "0 row affected";
        }
    }

    //����� ��� �����������
    static class DatabaseCache extends DatabaseWorker{
        private DatabaseWorker service;
        private boolean needReset;
        private String connectCache;
        private String querryCache;
        DatabaseCache(DatabaseWorker service){
            this.service=service;
            this.needReset=false;
        }

        @Override
        public String connect(String ConnectionString) {
            if ((connectCache==null)||(needReset)){
                connectCache =service.connect(ConnectionString);
            }
            return connectCache;
        }

        @Override
        public String querry(String SQL) {
            if ((querryCache==null)||(needReset)){
                querryCache=service.querry(SQL);
            }
            return querryCache;
        }
    }
    // ����� GUI, ������� ���������� ��������� ������. ������
    // ��������� ������� �� ����������� ��� ������-�����������.
    // ������ ������ �� �������, ��� ��� ����������� ����� ��� ��
    // ���������, ��� � ������.
    static class DatabaseManager{
        DatabaseWorker databaseWorker;
        DatabaseManager(DatabaseWorker databaseWorker){
            this.databaseWorker=databaseWorker;
        }
        void makeConnection(String connectionString){
            databaseWorker.connect(connectionString);
        }
        String runQuerry(String SQL){
            return databaseWorker.querry(SQL);
        }
    }

    public static void main(String[] args) {
        //������� ���� �������
        //��������� �� ���� � ����� ��� �������
        DatabaseWorker databaseWorker =new DatabaseWorker();
        DatabaseCache databaseCache = new DatabaseCache(databaseWorker);
        DatabaseManager databaseManager = new DatabaseManager(databaseCache);

        databaseManager.makeConnection("127.0.0.1");
        databaseManager.runQuerry("Select * from *");
    }

}
