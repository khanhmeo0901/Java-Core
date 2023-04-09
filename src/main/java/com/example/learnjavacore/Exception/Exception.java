package com.example.learnjavacore.Exception;

public class Exception {
    /*
        - Exception là một tình trang bất thường
            + Trong Java , Exception là 1 sự kiện phá vỡ luồng chuẩn của chương trình.
            + Nó là 1 dối tượng mà được ném vào Runtime
        - Các kiểu Exception :
            + Checked Exception : Là ngoại lệ thường xảy ra do người dùng không thể lường
                trước được bởi lập trình viên
            + Unchecked Exception : Là ngoại lệ xảy ra ở Runtime là ngoại lệ có thể tránh được
                bởi lập trình viên
            + Error : Nó không giống với các Exception , nhưng vấn đề xảy ra vượt quá tầm kiểm
                soát của lập trình viên  hay người dùng.
         - Xử lí ngoại lệ (Exception Handling) : là một kĩ thuật xử lí các Runtime Error như
            ClassNotFound, IO, SQL, Remote,...
         - Các cấp bậc trong Exception :
            + Tất cả các lớp Exception đều là lớp con của lớp java.lang.Exception
            + Lớp Exception là lớp con của lớp Throwable
            + Một loại Exception khác là Error cũng là lớp con của lớp Throwable.
            + Error không thường được đặt bẫy bởi các chương trình Java.
            + Error thường được tạo ra để thể hiện lỗi trong môi trường Runtime.
         - Các tình huống phổ biến mà Exception có thể xảy ra:
            + Với ArithmaticException : Xảy ra nếu chia cho 0
            + Với NullPointerException : Nếu bạn có giá trị null trong bất cứ biê nào
                thì việc thực hiện bất cứ hoạt động nào bởi biến này làm xuất hiện kiểu exception này.
            + Với NumberFormatException : Việc định dạng sai bất cứ giá trị nào, có thể gây ra loại ngoại lệ
                này.
            + Với ArrayIndexOutOfBoundsException : Nếu bạn đang chèn bất cứ giá trị nào trong một chỉ mục sai
                thì sẽ làm xuất hiện kiểu exception này.
     */
    public static void main(String[] args) {

    }
}
