package com.urdomain.test;

public class Baseball {
	// �̰� �� ���ü��� ���̴ּ��ſ�. ���ý������?
	// ���� �̰͵� //�ϴ� �ѱ۷� �ּ� �޾ƺ�����. ������ �Ѱ�ó�� �Ӽ��� ����.
	// �Ӽ��� �ʵ�� ������ �޼ҵ�� �ٲ�ſ���. �� �˰ڽ��ϴ�.. ������ �ʹ� �����ؼ� �β����׿� �Ф�
	// �β����� �Ͻ��ʿ�����. �ڽŰ��ְ� �ڵ��ϼ���! ������ �����Կ�.
	// �ʵ�
	int iScore;
	String team; 
	// �̷��� �����Ͻø� �ɰŰ��ƿ�. �� �����ϰڽ��ϴ�. �𸣰ų� �����ʿ��Ͻø� ���������� ������ּ���.
	// ���� �ȵ�����ø� �ʾ��. �ʱ�����! �� �˰ڽ��ϴ�!! �Ф� �����ؿ�!��! ����� �����ҰԿ�.��

	// ������
	public Baseball() {
		this.team = null;
	}

	public Baseball(String team) {
		this.team = team;
	}

	// �޼ҵ�
	void setScore(int _iScore) {
		this.iScore = _iScore;
	}

	int getScore() {
		return this.iScore;
	}

}
