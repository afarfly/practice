package org.bocai.decompiler.java;

public enum AttributeType {
	Code, // java�������ɵ��ֽ���ָ��
	ConstantValue, // final�ؼ��ֶ���ĳ���ֵ
	Deprecated, // ������Ϊdeprecated�ķ������ֶ�
	Exceptions, // �����׳����쳣
	InnerClass, // �ڲ����б�
	LineNumberTable, // javaԴ����к����ֽ���ָ��Ķ�Ӧ��ϵ
	LocalVariableTable, // �����ľֲ���������
	SourceFile, // Դ�ļ�����
	Synthetic// ��ʶ�������ֶ�Ϊ�������Զ����ɵ�
}
