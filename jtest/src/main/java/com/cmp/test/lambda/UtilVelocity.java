package com.cmp.test.lambda;

import com.cmp.common.utils.FileUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by YANLL on 2016/05/10.
 */
public class UtilVelocity {

    private static final Log logger = LogFactory.getLog(UtilVelocity.class);
    private static VelocityEngine engine = null;

    public interface CallBack {
        public void invoke(VelocityContext context)throws IOException;
    }

    static {
        engine = new VelocityEngine();
        Properties properties = new Properties();
        String BASTPATH = "/var/velocity/";
        logger.info("init velocity templates path:" + BASTPATH);
        properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, BASTPATH);
        engine.init(properties);
    }

    public static void write(String template_file, String output_file_path, String output_file_name, CallBack call) {
        Template template = engine.getTemplate(template_file, "UTF-8");
        //初始化上下文
        VelocityContext context = new VelocityContext();
        PrintWriter pw = null;
        try {
            call.invoke(context);
            FileUtil.mkdirs(output_file_path);
            pw = new PrintWriter(output_file_path + "/" + output_file_name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        template.merge(context, pw);
        pw.close();
    }

}
