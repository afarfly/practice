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
	Synthetic,// ��ʶ�������ֶ�Ϊ�������Զ����ɵ�
	StackMapTable,//Ϊ�˼ӿ�Class�ļ���У���ٶȣ�������У��ʱ�����õ��������Ϣֱ��д�뵽Class�ļ���
	EnclosingMethod,//��һ����Ϊ�ֲ����������ʱ,��ͨ�������������������ʷ�Χ
	Signature,//�洢��,����,�ֶε�����ǩ��
	SourcingDebugException,//�洢����ĵ�����Ϣ,�����java���Ա���ɵ��ֽ���
	LocalVariableTypeTable,//ʹ������ǩ������������
	RuntimeVisibleAnnotions,//ָ����Щע��������ʱ�ɼ���
	RuntimeInvisibleAnnotions,
	RuntimeVisibleParameterAnnotations,//
	RuntimeInvisibleParameterAnnotations,
	AnnotationDefault //��¼ע����Ԫ�ص�Ĭ��ֵ 
	;
	
}
