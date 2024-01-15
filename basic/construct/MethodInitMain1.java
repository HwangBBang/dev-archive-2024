package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        member1.name = "usr1";
        member1.age = 15;
        member1.score = 90;

        Memberinit member2 = new Memberinit();
        member2.name = "usr2";
        member2.age = 16;
        member2.score = 80;

        Memberinit[] members = new Memberinit[]{member1, member2};

        for (Memberinit member : members) {
            System.out.print("member Name : " + member.name);
            System.out.print(" | member Age : " + member.age);
            System.out.println(" | member Score : " + member.score);
        }
    }

}
