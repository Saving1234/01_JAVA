package practice.level3;

public enum UserRole {

    GUEST("게스트", 1),
    USER("일반회원", 2),
    MANAGER("매니저", 3),
    ADMIN("관리자", 4);

    private final String descrption;
    private final int level;

    UserRole(String descrption, int level) {
        this.descrption = descrption;
        this.level=level;
    }



    public String getDescrption() {
        return descrption;
    }

    public int getLevel() {
        return level;
    }

    boolean hasHigherLevelThan(UserRole other){
//        boolean result;
//       if(this.level > other.level) {
//           System.out.println(result);
//       }

        return this.level > other.level;

    }
}
