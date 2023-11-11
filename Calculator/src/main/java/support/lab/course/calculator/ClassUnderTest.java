package support.lab.course.calculator;

import android.content.Context;

public class ClassUnderTest {

    Context mContext;

    public ClassUnderTest(Context context) {
        this.mContext = context;
    }

    public String getHelloWorldString() {
        return mContext.getString(R.string.text_hello_world);
    }
}
