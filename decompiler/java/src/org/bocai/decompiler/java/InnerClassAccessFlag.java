package org.bocai.decompiler.java;

public interface InnerClassAccessFlag {
	// �Ƿ�Ϊpublic����
	int ACC_PUBLIC = 0x0001;
	int ACC_PRIVATE = 0x0002;
	int ACC_PROTECTED = 0x0004;
	int ACC_STATIC = 0x0008;
	// �Ƿ�����Ϊfinal,ֻ�����������
	int ACC_FINAL = 0x0010;
	// ��ʶ����һ���ӿ�
	int ACC_INTERFACE = 0x0020;
	// �Ƿ�ΪΪabstract����,�Գ������ӿ�Ϊ��,����Ϊ��
	int ACC_ABSTRACT = 0x0400;
	// ��ʶ����ಢ�����û��������
	int ACC_SYNTHETIC = 0x1000;
	// ��ʶ����һ��ע��
	int ACC_ANNOTATION = 0x2000;
	// ��ʶ����һ��ö��
	int ACC_ENUM = 0x4000;
}
