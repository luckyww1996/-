package com.ssm.yunshang.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 文件操作类
 *
 */
public class FileUtil {

	/**
	 * 上传单个文件
	 * @param file
	 * @param path
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadFile(CommonsMultipartFile file,String path) throws IllegalStateException, IOException{
		
		File newFilePath = new File(path);
		if (!newFilePath.exists()){
			if(!newFilePath.mkdirs()){
				return "error:目录创建失败:"+path;
			}
		}
		//获取文件名
		String filename = file.getOriginalFilename();
		//获取文件扩展名
		String prefix = filename.substring(filename.lastIndexOf("."));
		//获取新的文件名
		String newFileName = UUID.randomUUID().toString().replace("-", "")+prefix;
		File newFile = new File(path+"/"+newFileName);
		//拷贝文件到指定目录
		file.transferTo(newFile);
		return newFileName;
	}
	
}
