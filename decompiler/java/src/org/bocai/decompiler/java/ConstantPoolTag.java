package org.bocai.decompiler.java;

public interface ConstantPoolTag {
	//UTF-8������ַ���
	int CONSTNAT_Utf8_info=1;
	//����������
	int CONSTNAT_Integer_info=3;
	int CONSTNAT_Float_info=4;
	int CONSTNAT_Long_info=5;
	int CONSTNAT_Double_info=6;
	//���ӿڵķ�������
	int CONSTNAT_Class_info=7;
	//�ַ�������������
	int CONSTNAT_String_info=8;
	//�ֶεķ�������
	int CONSTNAT_Fieldref_info=9;
	//���з����ķ�������
	int CONSTNAT_Methodref_info=10;
	//�ӿ��з����ķ�������
	int CONSTNAT_InterfaceMethodref_info=11;
	//�ֶλ򷽷��Ĳ��ַ�������
	int CONSTNAT_NameAndType_info=12;
}
