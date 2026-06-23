package com.debit.backend.services.abstracts;

import com.debit.backend.dtos.requests.CreateSubCategoryRequest;
import com.debit.backend.dtos.responses.SubCategoryResponse;

import java.util.List;

public interface SubCategoryService {

    SubCategoryResponse create(CreateSubCategoryRequest request);

    List<SubCategoryResponse> getAll();

    SubCategoryResponse getById(Long id);

    List<SubCategoryResponse> getByCategoryId(Long categoryId);

    SubCategoryResponse update(Long id, CreateSubCategoryRequest request);

    void delete(Long id);
}