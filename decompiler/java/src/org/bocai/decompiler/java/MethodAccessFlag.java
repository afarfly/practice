package org.bocai.decompiler.java;

public interface MethodAccessFlag {
	// �ַ��Ƿ�Ϊpublic
	int ACC_PUBLIC = 0x0001;
	int ACC_PRIVATE = 0x0002;
	int ACC_PROTECTED = 0x0004;
	int ACC_STATIC = 0x0008;
	int ACC_FINAL = 0x0010;
	int ACC_SYNCHRONIZED = 0x0020;
	// �����Ƿ����ɱ������������Žӷ���
	int ACC_BRIDGE = 0x0040;
	// �����Ƿ���ܲ�������
	int ACC_VARARGS = 0x0080;
	int ACC_NATIVE = 0x0100;
	int ACC_ABSTRACT = 0x0400;
	// �����Ƿ�Ϊstrictfp
	int ACC_STRICT = 0x0800;
	// �ֶ��Ƿ��ɱ������Զ�����
	int ACC_SYNTHETIC = 0x1000;
}
