# mybatis-generator


    public static void main(String[] args) { // 
    String url = "jdbc:mysql://localhost:3306";
    String userName = "root";
    String password = "1234567890";

    GenerateService generateService = new GenerateService(url, userName, password);

    // db name 
    String dbName = "mybatis";
    String[] tables = {"hotel_book_info"};
    //the path to save generate files
    String filePath = "D:/test";
    generateService.generateCode(dbName, tables, filePath);
    }
