package com.yeepay.dao.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

public class BaseMapperGeneratorPlugin extends PluginAdapter {

    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 生成dao
     */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {
        /**
         * 主键默认采用java.lang.Integer
         */
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseMapper<" + introspectedTable.getBaseRecordType()
                + "," + introspectedTable.getExampleType() + "," + "java.lang.Integer" + ">");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType("my.mabatis.example.base.BaseMapper");//baseMapper包名次
        /**
         * 添加 extends MybatisBaseMapper
         */
        interfaze.addSuperInterface(fqjt);

        /**
         * 添加import my.mabatis.example.base.MybatisBaseMapper;
         */
        interfaze.addImportedType(imp);
        /**
         * 方法不需要
         */
        interfaze.getMethods().clear();
        interfaze.getAnnotations().clear();
        return true;
    }

}
