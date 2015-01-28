class NativeDemo {
public native static void test();
static{
System.loadLibrary("NativeDemo");
}
}