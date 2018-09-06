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
 * �ļ�������
 *
 */
public class FileUtil {

	/**
	 * �ϴ������ļ�
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
				return "error:Ŀ¼����ʧ��:"+path;
			}
		}
		//��ȡ�ļ���
		String filename = file.getOriginalFilename();
		//��ȡ�ļ���չ��
		String prefix = filename.substring(filename.lastIndexOf("."));
		//��ȡ�µ��ļ���
		String newFileName = UUID.randomUUID().toString().replace("-", "")+prefix;
		File newFile = new File(path+"/"+newFileName);
		//�����ļ���ָ��Ŀ¼
		file.transferTo(newFile);
		return newFileName;
	}
	
}
