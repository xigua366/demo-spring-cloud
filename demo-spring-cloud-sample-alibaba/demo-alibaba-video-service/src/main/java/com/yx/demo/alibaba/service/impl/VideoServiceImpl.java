package com.yx.demo.alibaba.service.impl;

import com.yx.demo.alibaba.dao.VideoDAO;
import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.entity.VideoDO;
import com.yx.demo.alibaba.domain.request.VideoRequest;
import com.yx.demo.alibaba.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author yangxi
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDAO videoDAO;

    @Transactional
    @Override
    public VideoDO createVideo(VideoRequest request) {
        VideoDO videoDO = createVideoDO(request);
        videoDAO.save(videoDO);
        return videoDO;
    }

    private VideoDO createVideoDO(VideoRequest request) {
        VideoDO videoDO = new VideoDO();
        videoDO.setTitle(request.getTitle());
        videoDO.setSummary(request.getSummary());
        videoDO.setCoverImg(request.getCoverImg());
        videoDO.setPrice(request.getPrice());
        videoDO.setPoint(request.getPoint());
        return videoDO;
    }

    @Override
    public VideoDTO findById(Long videoId) {
        VideoDO videoDO = videoDAO.getById(videoId);
        if(videoDO == null) {
            throw new RuntimeException("videoDO不存在");
        }
        return createVideoDTO(videoDO);
    }

    private VideoDTO createVideoDTO(VideoDO videoDO) {
        VideoDTO videoDTO = new VideoDTO();
        videoDTO.setId(videoDO.getId());
        videoDTO.setTitle(videoDO.getTitle());
        videoDTO.setSummary(videoDO.getSummary());
        videoDTO.setCoverImg(videoDO.getCoverImg());
        videoDTO.setPrice(videoDO.getPrice());
        videoDTO.setPoint(videoDO.getPoint());
        videoDTO.setCreateTime(videoDO.getCreateTime());
        return videoDTO;
    }

    @Transactional
    @Override
    public boolean updatePoint(Long videoId, BigDecimal point) {

        VideoDO videoDO = videoDAO.getById(videoId);
        videoDO.setPoint(point);
        return videoDAO.updateById(videoDO);
    }
}
