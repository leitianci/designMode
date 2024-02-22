package experiment2;

public class Client {
    public static void main(String[] args) {
        ActorController ac = new ActorController();

        ActorBuilder ab = new VampireBuilder();
        Actor actor = ac.contruct(ab);
        System.out.println(actor.type + "的任务设定");
        System.out.println("性别:" + actor.sex);
        System.out.println("技能:" + actor.skill);
    }
}
