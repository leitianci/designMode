package experiment2;

public class VampireBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.type = "吸血鬼";
    }

    @Override
    public void buildSex() {
        actor.sex = "男";
    }

    @Override
    public void buildskill() {
        actor.skill = "吸血";
    }
}
