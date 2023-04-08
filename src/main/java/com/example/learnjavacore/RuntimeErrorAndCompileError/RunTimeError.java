package com.example.learnjavacore.RuntimeErrorAndCompileError;

public class RunTimeError {
    /*
        - RunTime Error là lỗi bị xảy ra trong quá trình thực thi đoạn mã nguồn
        + Rõ ràng hơn nữa là lỗi xảy ra khi quá trình được chạy
        + Đó là lỗi mà Compile khó mà phát hiện ra được
        --> Nên khó khăn để debug hoặc tìm ra lỗi
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(a/b);

        // Ví dụ ở đây là 10 chia cho 0 là sai về mặt tính toán.Nhưng Compile không phát hiện ra
    }
}
