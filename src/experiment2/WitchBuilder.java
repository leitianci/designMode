package experiment2;

public class WitchBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.type = "女巫";
    }

    @Override
    public void buildSex() {
        actor.sex = "女";
    }

    @Override
    public void buildskill() {
        actor.skill = "魔法";
    }
}
