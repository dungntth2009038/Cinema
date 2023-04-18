package com.fpt.edu.controllers;
import com.fpt.edu.models.NhaXuatBan;
import com.fpt.edu.repository.NhaXuatBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/admin/nxb")
public class NhaXuatBanControllerAdmin {
    @Autowired
    NhaXuatBanRepository nhaXuatBanRepository;

    @ModelAttribute("allNxbs")
    public List<NhaXuatBan> populateTypes() {
        return nhaXuatBanRepository.findAll();
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping("/new")
    public String addForm(Model model) {
        NhaXuatBan nhaXuatBan = new NhaXuatBan();
        model.addAttribute("nhaXuatBan", nhaXuatBan);
        return "nxb/nxb-add";
    }

    @PostMapping("/add")
    public String add(@Valid NhaXuatBan nhaXuatBan,
                      BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "nxb/nxb-add";
        }
        nhaXuatBanRepository.save(nhaXuatBan);
        return "redirect:/admin/nxb/index";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        NhaXuatBan nhaXuatBan = nhaXuatBanRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Nha Xuat Ban Id:" + id));

        model.addAttribute("nhaXuatBan", nhaXuatBan);
        return "nxb/nxb-update";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid NhaXuatBan nhaXuatBan,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            nhaXuatBan.setId(id);
            return "nxb/nxb-update";
        }

        nhaXuatBanRepository.save(nhaXuatBan);
        return "redirect:/admin/nxb/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        NhaXuatBan nhaXuatBan = nhaXuatBanRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        nhaXuatBanRepository.delete(nhaXuatBan);
        return "redirect:/admin/nxb/index";
    }
}