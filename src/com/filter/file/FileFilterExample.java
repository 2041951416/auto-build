package com.filter.file;
import java.io.File;
import java.io.FilenameFilter;

public class FileFilterExample {
    public static void main(String[] args) {
        // 指定要搜索的目录路径
        String directoryPath = "C:\\demo810"; // 请替换为实际的目录路径
        File directory = new File(directoryPath);

        // 使用匿名内部类实现FilenameFilter接口
        File[] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // 检查文件名是否是pom.xml或application.properties
                return name.equals("pom.xml") || name.equals("application.properties");
            }
        });

        // 打印出过滤后的文件名
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("没有找到文件或目录不可访问。");
        }
    }
}