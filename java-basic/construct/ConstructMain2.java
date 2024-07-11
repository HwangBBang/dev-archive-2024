package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct obj1 = new MemberConstruct("usr1",15,90);
        MemberConstruct obj2 = new MemberConstruct("usr2",16);

        MemberConstruct[] members = new MemberConstruct[]{obj1, obj2};

        for (MemberConstruct member : members) {
            System.out.print("member Name : " + member.name);
            System.out.print(" | member Age : " + member.age);
            System.out.println(" | member Score : " + member.score);
        }
    }
}
