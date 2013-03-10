package org.bocai.decompiler.java;

public interface AccessFlag {
	// �Ƿ�Ϊpublic����
	int ACC_PUBLIC = 0x0001;
	// �Ƿ�����Ϊfinal,ֻ�����������
	int ACC_FINAL = 0x0010;
	// �Ƿ�����ʹ��invokespecial�ֽ���ָ��,jdk1.2��Ϊ��
	int ACC_SUPER = 0x0020;
	// ��ʶ����һ���ӿ�
	int ACC_INTERFACE = 0x0200;
	// �Ƿ�ΪΪabstract����,�Գ������ӿ�Ϊ��,����Ϊ��
	int ACC_ABSTRACT = 0x0400;
	// ��ʶ����ಢ�����û��������
	int ACC_SYNTHETIC = 0x1000;
	// ��ʶ����һ��ע��
	int ACC_ANNOTATION = 0x2000;
	// ��ʶ����һ��ö��
	int ACC_ENUM = 0x4000;
}
