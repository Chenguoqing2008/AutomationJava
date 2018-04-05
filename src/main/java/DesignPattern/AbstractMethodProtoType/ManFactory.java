package DesignPattern.AbstractMethodProtoType;
//����ѧϰ��׬Ǯ������
public class ManFactory implements IHumanFactory {
    public IStudy getStudy() {
        return new ManStudy();
    }
    public IMakeMoney getMakeMoney() {
        return new ManMakeMoney();
    }
}
