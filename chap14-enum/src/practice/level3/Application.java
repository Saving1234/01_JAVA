package practice.level3;

import java.util.EnumSet;
import java.util.List;

public class Application {

    public static void main(String[] args) {


//        MANAGER 가 USER 보다 높은가? true
        boolean result = UserRole.MANAGER.hasHigherLevelThan(UserRole.USER);
        System.out.println("MANAGER 가 USER 보다 높은가? : " + result);

        EnumSet<UserRole> enumSet = EnumSet.of(UserRole.MANAGER, UserRole.ADMIN);
        System.out.println("USER 는 관리 권한?" + enumSet);


        EnumSet<UserRole> enumSet2 = EnumSet.complementOf(enumSet);

        System.out.println(enumSet2.size());
        for(UserRole userRole : enumSet2){
            System.out.println("test1" + userRole.getDescrption());
        }

        System.out.println("test1" + enumSet.contains( UserRole.ADMIN));

        boolean result2 = UserRole.MANAGER.hasHigherLevelThan(UserRole.ADMIN);
        System.out.println(result2);
        result2 = UserRole.ADMIN.hasHigherLevelThan(UserRole.MANAGER);

        System.out.println(result2);


        //discription 출력.
        //이넘 관리권한 집합(of) , ㄱ
        //




    }

    private static void extracted(boolean result2) {
        System.out.println(result2);
    }

//    public void(UserRole de)


}
