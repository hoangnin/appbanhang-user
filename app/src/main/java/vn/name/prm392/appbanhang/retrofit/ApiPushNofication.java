package vn.name.prm392.appbanhang.retrofit;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import vn.name.prm392.appbanhang.model.NotiResponse;
import vn.name.prm392.appbanhang.model.NotiSendData;


public interface ApiPushNofication {
    @Headers(
            {
                 "Content-Type:application/json",
                    "Authorization:key=AAAAzyvrDB4:APA91bHDixvlV5WC7rlYGw6-ImRM-DJbr1PWw0TYTtnyxJrLOahstNcYqpcDUSJZsJAm0YahVH85X5DHp54GbyFROHyZzxkCrC_MIH5ZPVlY6SyDcUNeXTSQs9F4Zxtql8S1yenstP2i"
            }
    )
    @POST("fcm/send")
    Observable<NotiResponse> sendNofitication(@Body NotiSendData data);
}
