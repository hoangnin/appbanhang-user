package vn.name.prm392.appbanhang.utils;

import java.util.ArrayList;
import java.util.List;

import vn.name.prm392.appbanhang.model.GioHang;
import vn.name.prm392.appbanhang.model.User;

public class Utils {
    public static final String BASE_URL="http://172.15.192.75/banhang/";
    public static List<GioHang> manggiohang;
    public static List<GioHang> mangmuahang = new ArrayList<>();
    public static User user_current = new User();

    public static String ID_RECEIVED;
    public static final String SENDID = "idsend";
    public static final String RECEIVEDID = "idreceived";
    public static final String MESS = "message";
    public static final String DATETIME = "datetime";
    public static final String PATH_CHAT = "chat";
    public static String statusOrder(int status){
        String result = "";
        switch (status){
            case 0:
                result ="Đơn hàng đang được xử lí";
                break;
            case 1:
                result ="Được tiếp nhận";
                break;
            case 2:
                result ="Giao cho vận chuyển";
                break;
            case 3:
                result ="Giao thành công";
                break;
            case 4:
                result ="Hủy";
                break;
            default:
                result = "...";
        }
        return result;
    }
}
