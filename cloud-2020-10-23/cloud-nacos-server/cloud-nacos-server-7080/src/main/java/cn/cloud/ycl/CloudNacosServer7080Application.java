package cn.cloud.ycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosServer7080Application {

    public static void main(String[] args) {
//        disableAccessWarnings();
        SpringApplication.run(CloudNacosServer7080Application.class, args);
    }


//    /**
//     * 忽略非法反射警告  适用于jdk11
//     */
//    @SuppressWarnings("unchecked")
//    public static void disableAccessWarnings() {
//
//        try {
//            Class unsafeClass = Class.forName("sun.misc.Unsafe");
//            Field field = unsafeClass.getDeclaredField("theUnsafe");
//            field.setAccessible(true);
//            Object unsafe = field.get(null);
//
//            Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
//            Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);
//
//            Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
//            Field loggerField = loggerClass.getDeclaredField("logger");
//            Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
//            putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
//        } catch (Exception ignored) {
//        }
//    }
}
