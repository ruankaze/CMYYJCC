import request from '@/utils/request'

// 查询饰品类别列表
export function listCategory(query) {
  return request({
    url: '/ornament/category/list',
    method: 'get',
    params: query
  })
}

// 查询饰品类别详细
export function getCategory(categoryId) {
  return request({
    url: '/ornament/category/' + categoryId,
    method: 'get'
  })
}

// 新增饰品类别
export function addCategory(data) {
  return request({
    url: '/ornament/category',
    method: 'post',
    data: data
  })
}

// 修改饰品类别
export function updateCategory(data) {
  return request({
    url: '/ornament/category',
    method: 'put',
    data: data
  })
}

// 删除饰品类别
export function delCategory(categoryId) {
  return request({
    url: '/ornament/category/' + categoryId,
    method: 'delete'
  })
}

// 导出饰品类别
export function exportCategory(query) {
  return request({
    url: '/ornament/category/export',
    method: 'get',
    params: query
  })
}