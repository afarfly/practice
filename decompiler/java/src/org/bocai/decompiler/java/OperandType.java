package org.bocai.decompiler.java;
 
public enum OperandType {
	CONSTANT_POOL_INDEX, // ����������,�޷�������
	LOCAL_VARIABLES_INDEX, // ���ر�������,�޷�������
	INT_VALUE,// �з�������
	UNSIGNED_BYTE,//�޷����ֽ�
	ZERO,//
	BRANCH_OFFSET, //�з�������
	INDEX_CONST,//indexΪu1�ı��ر���������constΪ�з��ŵ�һ���ֽڵ�����
	MUTABLE,//���������̶�������ָ����ȷ��������lookupswitch
	; 

}
