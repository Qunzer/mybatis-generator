package com.qunar;

import com.qunar.mybatis.service.GenerateService;

/**
 * Created by renqun.yuan on 2016/4/4.
 */
public class TestGenerateServiceCode {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String userName = "root";
        String password = "1234567890";
        GenerateService generateService = new GenerateService(url, userName, password);
        String dbName = "mybatis";
        String[] tables = {"hotel_book_info"};
        String filePath = "D:/test";
        generateService.generateCode(dbName, tables, filePath);
    }
}
