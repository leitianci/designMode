package experiment2;

public class WerewolfBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.type = "狼人";
    }

    @Override
    public void buildSex() {
        actor.sex = "男";
    }

    @Override
    public void buildskill() {
        actor.skill = "撕咬";
    }
}
